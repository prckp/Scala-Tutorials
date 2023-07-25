object T6take2 extends App{
  // Encryption function
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // Decryption function
  def decrypt(cipherText: String, shift: Int): String = {
    encrypt(cipherText, 26 - shift)
  }

  val plaintext = "XYZ"
  val shift = 1

  println("Plain text: "+plaintext);
  val encryptedText = encrypt(plaintext, shift)
  println(s"Encrypted: $encryptedText")

  val decryptedText = decrypt(encryptedText, shift)
  println(s"Decrypted: $decryptedText")


}
