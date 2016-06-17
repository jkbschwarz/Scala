def max(xs: List[Int]): Int = {
  if (xs.isEmpty)
    throw new NoSuchElementException("the list is empty")
  else
    max_counter(xs)
}

def max_counter(xs: List[Int]): Int = {
  if (xs.length<1)
    -999999
  else
    if (xs(0)>max_counter(xs.slice(1,xs.length)))
      xs(0)
    else
      max_counter(xs.slice(1,xs.length))
}

max(List(1,2))