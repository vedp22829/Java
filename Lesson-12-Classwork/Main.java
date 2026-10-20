class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("College credit: " + collegeCredit("ABCDEM"));
    System.out.println("Counselor: " + getCounsoler("B12"));
    System.out.println("Image type: " + imageType("picture.jpg"));
  }

  boolean collegeCredit(String courseCode){
    if (courseCode == null || courseCode.length() < 6) {
      return false;
    }

    char sixthLetter = Character.toUpperCase(courseCode.charAt(5));
    return sixthLetter == 'E' || sixthLetter == 'M';
  }

  String getCounsoler(String officialClass){
    if (officialClass == null || officialClass.length() == 0) {
      return "Unknown";
    }

    char firstCharacter = Character.toUpperCase(officialClass.charAt(0));
    char middleCharacter = Character.toUpperCase(officialClass.charAt(officialClass.length() / 2));
    String counselor = counselorFor(firstCharacter);

    if (!counselor.equals("Unknown")) {
      return counselor;
    }
    return counselorFor(middleCharacter);
  }

  String counselorFor(char character){
    if (character == 'B') return "Berrouet";
    if (character == 'C') return "Chu";
    if (character == 'D') return "Dinn";
    if (character == 'E') return "Eyzengart";
    if (character == 'F') return "Flores";
    if (character == 'G') return "Gibson";
    if (character == 'L') return "Shim Lee";
    if (character == 'M') return "Meltzer";
    if (character == 'P') return "Paccione";
    if (character == 'S') return "Fiore";
    if (character == 'T') return "Tsai";
    if (character == 'Z') return "Zayes";
    return "Unknown";
  }

  String imageType(String fileName){
    if (fileName == null) {
      return "Unknown file type";
    }

    int dotPosition = fileName.lastIndexOf('.');
    if (dotPosition == -1 || dotPosition == fileName.length() - 1) {
      return "Unknown file type";
    }

    String extension = fileName.substring(dotPosition + 1).toUpperCase();
    if (extension.equals("JPEG") || extension.equals("JPG")) {
      return "Joint Photographic Experts Group";
    }
    if (extension.equals("PNG")) {
      return "Portable Network Graphics";
    }
    if (extension.equals("GIF")) {
      return "Graphics Interchange Format";
    }
    if (extension.equals("PDF")) {
      return "Portable Document Format";
    }
    return "Unknown file type";
  }
}