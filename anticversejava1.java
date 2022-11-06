//Java Practice 6 November
//AnticverseBankApp
class Main {
  // camelCase (ilk kekime harfi küçük, kalanı ilk harfler
  // değil)
  public static void main(String[] args) {

    String internetSubeButonu = "İnternet Şubesi";
    double dolarDun = 18.57;
    double dolarBugun = 18.58;
    int vade = 36; // daha büyük sayılarda "long"u
    // kullanıyoruz.
    boolean dustuMu = false;

    System.out.println(internetSubeButonu);

    if (dolarBugun < dolarDun) {
      System.out.println("Dolar düştü resmi");
    } else if (dolarBugun > dolarDun) {

    } 
    else {
      System.out.println("Dolar eşittir resmi");
    }
          String kredi1 ="Hızlı Kredi";
          String kredi2 ="Mutlu emekli Kredi";
          String kredi3 ="Konut Kredi";
          String kredi4 ="Çiftçi Kredi";
          String kredi5 ="Msb Kredi";
            
      System.out.println(kredi1);
      System.out.println(kredi2);
      System.out.println(kredi3);
      System.out.println(kredi4);
      System.out.println(kredi5);

  String[] krediler = 
  {"Hızlı Kredi","Mutlu emekli Kredi","Konut Kredi","Çiftçi Kredi","Msb Kredi","Kültür bakanlığı kredisi"};
    //foreach
    for(String kredi : krediler) {
      System.out.println(kredi);
    }
   for(int i = 0; i<krediler.length;i++) {//sayaç güdümlü döngü
      //start     //döngü ne kadar dönsün(şart) (length eleman sayısı, i ,eleman sayısından küçük olduğu sürece döndürecek)
    //i++ 'yi 1 arttırmak i=i+1 ile aynı işlevi görmektedir 
     System.out.println(krediler[i]);

   }//veri tipi ayırt etme testleri
int sayi1 = 10;
    int sayi2 = 20;
    sayi1 = sayi2;
    sayi2 = 100;
System.out.println(sayi1);

    int[] sayilar1 = {1,2,3,4,5};
    int[] sayilar2 = {10,20,30,40,50};
    sayilar1 = sayilar2;
    sayilar2[0] = 100;
    System.out.println(sayilar1[0]);
//arrayler değer tip değil farklı tip veri çeşididir. heapte referanslar oluşturur.
    //"Java Garbage Collector" heap'te sayilar 1 dizisini boş adreste kaldığı için temizler
String sehir1 = "Ankara";
String sehir2 = "İstanbul";
    sehir1 = sehir2;
    sehir2 = "İzmir";
    System.out.println(sehir1);
//5.nesil yazılım dillerinde arkada referans olsa da sistem onu değer olarak gösterir aslında string dizidir (harflerden oluşur) stringlere özel bir istisna olarak düşünebiliriz.
    
  }
}
