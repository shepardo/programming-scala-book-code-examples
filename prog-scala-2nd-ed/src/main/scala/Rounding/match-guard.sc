// src/main/scala/Rounding/match-tuple.sc

for (i <- List(1,2,3,4,5,6,7)) {
  i match {
    case _ if i%2 == 0 => println(s"even: $i")
    case _             => println(s"odd:  $i")
  }
}
