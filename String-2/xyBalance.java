public boolean xyBalance(String str) {
    /* I could use a bunch of conditionals to solve
    * this, but I let Java do its work.
    */
      if(!str.contains("x")){
        return true;
      
      }
      return str.lastIndexOf('x') < str.lastIndexOf('y');
    }