fun main() {
    var baslikListesi = mutableListOf<String>()

    var icerikListesi = mutableListOf<String>()

    var menuTest = true

    while (menuTest) {
        println("1-Not Ekle")
        println("2-Notları Listele")
        println("3-Çıkış")

        val  secim = readLine()

        when(secim){
            "1" -> {
                println("Not başlığını giriniz:")
                val baslik = readLine() ?:""

                println("Not içeriğini giriniz:")
                val icerik = readLine() ?:""

                baslikListesi.add(baslik)
                icerikListesi.add(icerik)

                println("Notunuz başarıyla eklendi.")
            }
            "2" -> {
                if (baslikListesi.isEmpty()){
                    println("Henüz hiç not girilmedi.")
                }else{
                    println("kayıtlı notlar:")
                    for(i in baslikListesi.indices){
                        println("${i+1} Başlık:$baslikListesi")
                        println("içerik:$icerikListesi")
                    }
                }

            }
            "3" -> {
                println("çıkış yapmak istiyor musunuz?(evet/hayır)")
                val cevap = readLine()

                if(cevap == "evet" || cevap == "Evet"){
                    println("Çıkışınız yapılıyor...")
                    menuTest = false
                }else if (cevap == "hayır" || cevap == "Hayır"){
                    println("menüye dönülüyor...")
                }else{
                    println("Yanlış yazım lütfen evet ya da hayır yazınız!!")
                }

            }
            else -> {
                println("Geçersiz seçim yaptınız, lütfen tekrar deneyiniz.")
            }
        }
    }
}