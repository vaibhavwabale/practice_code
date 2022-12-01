//1
object main {
  
  var str1 = "scala"
  
  def main(args: Array[String]) {
    println(str1)
  }
}

//2
object main {
  
  var str1 = "scala"
  var len = str1.length()
  
  def main(args: Array[String]) {
    println("String 1: " + str1 + "\n length: " + len)
  }
}

//3
object main {
  
  var str1 = "scala"
  
  def main(args: Array[String]) {
    
    val n = str1.length()
    for( i <- 0 to n - 1) {
      println(str1.charAt(i))
    }
    
  }
}

//4
object main {
  
  var str1 = "scala"
  
  def main(args: Array[String]) {
    
    var revString = ""
    val n = str1.length()
    for( i <- 0 to n - 1) {
      revString = revString.concat(str1.charAt(n-i-1).toString)
    }
    
    println("String: " + str1 + "\n Reverse String: " + revString)
    
  }
}

//5
object main {
  
  var str1 = "scala "
  var str2 = "program "
  
  
  
  def main(args: Array[String]) {
    
    var newStr = str1.concat(str2)
    
    
    println("String 1: " + str1)
    println("String 2: " + str2)
    println("New String: " + newStr)
  }
}

//6
object main {
  
  var str1 = "scala"
  
  def main(args: Array[String]) {
    
    var substring = str1.substring(0,2)
    println(substring)
    
  }
}
