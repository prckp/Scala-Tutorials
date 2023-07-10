object T5Q3 extends App{
  def sum(n:Int):Int={
    if (n <= 0){
      return 0
    }else{
      return n + sum(n-1)
    }
  }
  println(sum(5))

}
