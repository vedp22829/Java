class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  String creditCardType(String number){
    if (number.substring(0,4).equals("6011")) 
        return "Discovery";
    if (number.substring(0,2).equals("34") || number.substring(0,2).equals("37"))
        return "America Express";
    if (number.substring(0,2).equals("36"))
       return "Diner Club";
    if (number.substring(0,2).equals("51") || number.substring(0,2).equals("55")) 
       return "Mastercard";
    if (number.substring(0,2).equals("65")) 
       return "Discovery";
    if (number.substring(0,1).equals("4")) 
        return "Visa";
  }

  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }

  String nycLocate(String zipCode){
    String firstThree = zipCode.substring(0,3);
    if (firstThree.equals("100") || firstThree.equals("101") || firstThree.equals("102")) 
        return "Manhattan";
    if (firstThree.equals("103"))
        return "Staten Island";
    if (firstThree.equals("104")) 
        return "Bronx";
    if (firstThree.equals("112"))
        return "Brooklyn";
    if (firstThree.equals("113") || firstThree.equals("114") || firstThree.equals("111"))
        return "Queens";
    }

  String getMonth(String date){
    String month = date.substring(0,2);
    if (month.equals("01")) 
      return "January";
    if (month.equals("02")) 
      return "February";
    if (month.equals("03"))
      return "March";
    if (month.equals("04")) 
      return "April";
    if (month.equals("05")) 
      return "May";
    if (month.equals("06")) 
      return "June";
    if (month.equals("07")) 
      return "July";
    if (month.equals("08")) 
      return "August";
    if (month.equals("09"))
      return "September";
    if (month.equals("10")) 
      return "October";
    if (month.equals("11")) 
      return "November";
    if (month.equals("12")) 
      return "December";
    }

  boolean validatePswd(String password){
    if (password.length() < 5 || password.length() > 8)
         return false;
    if (password.indexOf("^") != -1 || password.indexOf("*") != -1 ||
        password.indexOf("(") != -1 || password.indexOf(")") != -1)
         return false;
    return true;
  }
  
}
  }

  
  
}