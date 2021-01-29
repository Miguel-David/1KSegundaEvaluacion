package SwingInicios;
public enum Grade {
  INS("Insuficient Weight",18.5),
  NRM("Normal Wight",24.9),
  SBR1("Overweight Grade 1",26.9),
  SBR2("Overweight Grade 2: Probesity",29.9),
  OBS1("Obesity Grade 1",34.9),
  OBS2("Obesity Grade 2",3.9),
  OBS3("Obesity Grade 3: Morbid",49.9),
  OBS4("Obesity Grade 4: Extreme",50);

  private final String title;
  private final double lim;

  public String getTitle() {
    return title;
  }

  public double getLim() {
    return lim;
  }

  Grade(String s, double i) {
    title = s;
    lim = i;
  }

  public static String getGrade(double value){
    for (int i=0; i < Grade.values().length;i++){
      if(value > Grade.OBS4.getLim()){
        return Grade.OBS4.getTitle();
      } else if(value < Grade.INS.getLim()){
        return Grade.INS.getTitle();
      } else if(value > Grade.values()[i].getLim() && value < Grade.values()[i+1].getLim()){
        return Grade.values()[i+1].getTitle();
      }
    }
    return null;
  }
}