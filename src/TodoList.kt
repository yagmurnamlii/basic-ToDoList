fun main(){
    println("To Do liste hoş geldiniz.")

    val gorevListesi = mutableListOf< String>()

    var anaMenu = true
    while (anaMenu){
        println("1-Yeni görev ekle")
        println("2-Tüm görevleri göster")
        println("3-Bir görevi tamamlandı olarak işaretle")
        println("4-bir görevi sil")
        println("5-Çıkış yap")


        println("lütfen yapmak istediğiniz işlemi seçin : ")
        val secim = readLine() ?:""

        when(secim){
            "1" -> {
                println("Lütfen bir görev ekleyin")
                val gorevEkleme = readLine() ?:""
                gorevListesi.add(gorevEkleme)

                println("Görev başarıyla eklendi.")
            }
            "2" -> {
                if (gorevListesi.isEmpty()){
                    println("Listelenecek görevler bulunmamaktadır.")
                }else {
                    println("kayıtlı görevleriniz:")
                    for (i in gorevListesi.indices ){
                        println("${i+1}. göreviniz: ${gorevListesi[i]}")

                    }
                }
            }
            "3"-> {

                if (gorevListesi.isEmpty()){
                    println("herhangi bir görev bulunmamaktadır")
                }else {
                    for (i in gorevListesi.indices){
                        println("${i+1}. göreviniz: ${gorevListesi[i]}")
                    }
                }
                println("lütfen tamamlanan görevlerin numaralarını giriniz:")
                val numara = readLine()?.toIntOrNull()

                if (numara != null && numara in 1..gorevListesi.size){
                    val index = numara - 1
                    val mevcutGorev = gorevListesi[index]

                    if (!mevcutGorev.contains("✓")) {
                        gorevListesi[index] = "$mevcutGorev ✓"
                        println("görev tamamlandı")

                    }else{
                        println("Görev zaten tamamlanmış")
                    }


                }else{
                    println("Geçersiz işlem lütfen tekrar kontrol edin!!!")
                }


            }
            "4"-> {
                if (gorevListesi.isEmpty()){
                    println("silinecek görev kaydı bulunmamaktadır.")
                }else {
                    for (i in gorevListesi.indices) {
                        println("${i+1}. göreviniz: ${gorevListesi[i]}")
                    }
                }
                println("lütfen silmek istediğiniz görevin numarasını giriniz : ")
                val numaraSil = readLine()?.toIntOrNull()

                if (numaraSil != null && numaraSil in 1..gorevListesi.size){
                    val silinenGorev = gorevListesi.removeAt(numaraSil - 1)
                    println("Görev silindi : $silinenGorev")
                }else {
                    println("Geçersiz görev numarası girilmiştir. Lütfen tekrar kontrol ediniz!!!")
                }
            }
            "5"-> {
                println("çıkış yapmak istiyor musunuz (evet/hayır)")
                val cikis = readLine() ?:""

                if (cikis == "Evet" || cikis == "evet"){
                    println("çıkışınız yapılıyor...")
                    anaMenu = false

                }else if (cikis == "hayır" || cikis == "Hayır") {
                    println("Ana menüye dönülüyor")
                }else {
                    println("Lütfen sadece evet ya da hayır yazınız!!!!")
                }
            }
            else -> println("Geçersiz seçim yaptınız, lütfen tekrar deneyiniz.")
        }

    }
}