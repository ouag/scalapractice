package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 ||  c == r) return 1
      return pascal(c, r-1) + pascal(c-1, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      if (isBalance(chars, 0)._2 == 0) return true
      else false

    }


  def isBalance(chars: List[Char], parenthesis :Int): (List[Char], Int) = {

      if (chars.isEmpty) return (chars,parenthesis)

      var par:Int=parenthesis

      if (chars.head.equals('(') ) {
        par = par - 1
      } else if (chars.head.equals(')')) {
        par = par + 1
      }

      if (par > 0) return (chars,1)

      val nextChars:List[Char] = chars.slice(1, chars.size)
      return isBalance(nextChars, par)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
