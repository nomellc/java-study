-- Calendar 클래스와 SimpleDateFormat 클래스를 이용해서 2010년의 매월 두번째 일요일의 날짜를 출력하시오.

Calendar cal = Calendar.getInstance();

cal.set(2010,0,1);

for(int i=0;i<12;i++){
  
    int weekday = cal.get(Calendar.DAY_OF_WEEK);  
    int secondSunday = (weekday==1) ? 8 : 16 - weekday;
    cal.set(Calendar.DAY_OF_MONTH,secondSunday);
    Date d = cal.getTime();
    System.out.println(new SimpleDateFormat("yyyy-MM-dd는 F번쨰 E요일 입니다.").format(d));
    
    cal.add(Calendar.MONTH,1);
    cal.set(Calendar.DAY_OF_MONTH,1);
}
