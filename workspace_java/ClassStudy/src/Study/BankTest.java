package Study;

public class BankTest {
  public static void main(String[] args) {
    //Bank 클래스에 대한 객체를 5개 저장할 수 있는  배열 bankArr 생성
    Bank[] bankArr = new Bank[5];
    //bank 클래스에 대한 객체 5개를 만든 코드가 아니다.
    //bank 클래스에 대한 객체 5개를 저장할 수 있는  공간을 만든것!! 중요, 해석할때 주의.

    //bank클래스에 대한 객체를 5개 생성

    /*
    Bank b1 = new Bank("조자바",10000,"1111-2222");
    bankArr[0]=b1;

    bankArr[0] = new Bank("조자바",10000,"1111-2222");
    */

    bankArr[0] = new Bank("조자바",10000,"1111-2222");
    bankArr[1] = new Bank("김자바",20000,"2222-3333");
    bankArr[2] = new Bank("이자바",30000,"3333-4444");
    bankArr[3] = new Bank("박자바",50000,"4444-5555");
    bankArr[4] = new Bank("정자바",60000,"5555-6666");

    // bankArr 배열에 저장된 모든 계좌의 예금액 합을 출력

    /*
    int sum =0;
    for(int i =0; i < bankArr.length; i++){
      sum = sum + bankArr[i].getBalance();
    }
    System.out.println(sum);
    */

    int sum = 0;
    for( Bank bank : bankArr){
      sum = sum + bank.getBalance();
    }
    System.out.println(sum);

    //2. bankArr 에 저장된 모든 계좌 정보 중에서
    //계좌주가 "최자바"인 계좌 정보를 찾고, 그 정보 중
    //예금액을 20% 인상 시키는 코드 작성

    for(int i = 0; i < bankArr.length; i ++ ){
      if(bankArr[i].getOwner().equals("최자바")){
        //최종금액 = 원래 금액 * 1.2
        int result =(int)(bankArr[i].getBalance() * 1.2);
        bankArr[i].setBalance(result);
        //가격을 20% '변경'하는 거라 set.을 들고 와야함
      }
    }

    for(Bank bank : bankArr){
     if(bank.getOwner().equals("최자바")){
      bank.setBalance((int)(bank.getBalance()*1.2));
     }
    }
  }
}
