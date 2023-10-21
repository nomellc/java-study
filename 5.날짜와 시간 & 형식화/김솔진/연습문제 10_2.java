-- 어떤 회사의 월급날이 매월 21일이다. 두 날짜 사이에 월급날이 몇 번 있는지 계산해서 반환하는 메서드를 작성하고 테스트 하시오.

static int paycheckCount(Calendar from, Calendar to) {

      if (from == null || to == null) {
        
          return 0;
        
      }

      if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21) {
        
          return 1;
      
      }

      int fromYear = from.get(Calendar.YEAR);
      int fromMon = from.get(Calendar.MONTH);
      int fromDay = from.get(Calendar.DAY_OF_MONTH);

      int toYear = to.get(Calendar.YEAR);
      int toMon = to.get(Calendar.MONTH);
      int toDay = to.get(Calendar.DAY_OF_MONTH);

      int monDiff = (toYear * 12 + toMon) - (fromYear * 12 + fromMon);

      if (monDiff < 0) {
      
        return 0;
      
      }

      if (fromDay <= 21 && toDay >= 21) {
      
        monDiff++;
      
      }

      if (fromDay > 21 && toDay < 21) {
      
        monDiff--;
     
      }
      
  return monDiff;
  }

  static void printResult(Calendar from, Calendar to) {
    
      Date fromDate = from.getTime();
      Date toDate = to.getTime();

      SimpleDateFormatsdf = newSimpleDateFormat("yyyy-MM-dd");
      System.out.print(sdf.format(fromDate) + "~" + sdf.format(toDate) + ":");
      System.out.println(paycheckCount(from, to));
    
  }

  public static void main(String[] args) {
    
      Calendar fromCal = Calendar.getInstance();
      CalendartoCal = Calendar.getInstance();

      fromCal.set(2010, 0, 1);
      toCal.set(2010, 0, 1);
      printResult(fromCal, toCal);

      fromCal.set(2010, 0, 21);
      toCal.set(2010, 0, 21);
      printResult(fromCal, toCal);

      fromCal.set(2010, 0, 1);
      toCal.set(2010, 2, 1);
      printResult(fromCal, toCal);

      fromCal.set(2010, 0, 1);
      toCal.set(2010, 2, 23);
      printResult(fromCal, toCal);

      fromCal.set(2010, 0, 23);
      toCal.set(2010, 2, 21);
      printResult(fromCal, toCal);

      fromCal.set(2011, 0, 22);
      toCal.set(2010, 2, 21);
      printResult(fromCal, toCal);
    
  }
