

//Function to calculate time running of a block
  def time[R](block: => R) : R = {
    var startTime = System.currentTimeMillis()
    val result = block
    var endTime = System.currentTimeMillis()
    println("Tme elapsed: "+(endTime - startTime) + "ms")
    result
  }
