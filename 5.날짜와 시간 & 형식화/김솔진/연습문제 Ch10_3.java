-- 문자열 "123,456,789.5"를 소수점 첫 번쨰 자리에서 반올림하고, 그 값을 만 단위마다 콤마(,)로 구분해서 출력하시오.

  String data = "123,456,789.5";
  DecimalFormat df = new DecimalFormat("#,###.##");
  DecimalFormat df2 = new DecimalFormat("#,####");
  try{
      Numbernum=df.parse(data);
      doubled=num.doubleValue();
      System.out.println("data: "+data);
      System.out.println("반올림: "+Math.round(d));
      System.out.println("만단위: "+df2.format(d));
  }catch(Exception e){
      e.printStackTrace();
  }
