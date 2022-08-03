package uz.programmer710.infoprogramminglanguage

import android.content.Intent
import android.icu.text.IDNA
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_1.*
import kotlinx.android.synthetic.main.item_1.view.*
import uz.programmer710.infoprogramminglanguage.adapter.MyAdapter
import uz.programmer710.infoprogramminglanguage.models.User

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listQoshish()

        val adapter = MyAdapter(list, this)
        lisT.adapter = adapter

        lisT.setOnItemClickListener { parent, view, position, id ->


            if (position == 0){
//                Android
                val intent = Intent(this, InfoActivity::class.java)

                val name = "Android"
                val info = "Android (yunoncha andro — „inson, erkak“, oid qoʻshimchasi — „robot“; „odamsimon robot“) — smartfonlar, planshetlar, elektron kitoblar, raqamli pleyerlar, qoʻl soatlari, fitnes bilakuzuklar, oʻyin pristavkalari, noutbuklar, netbuklar, smartbuklar, Google Glass koʻzoynaklari[11], televizorlar[12], proyektorlar hamda boshqa qurilmalar (2015-yilda avtomobil koʻngilochar tizimlari va maishiy robotlarga ham oʻrnatildi) uchun operatsion tizim hisoblanadi.\n" +
                        "\n" +
                        "Dastlab ushbu operatsion tizim Android Inc. tomonidan ishlab chiqilgan, keyinchalik uni Google [14] sotib oldi. Operatsion tizim Linux yadrosi[15] va Google tomonidan ishlab chiqilgan Java virtual mashinasiga asoslangan. Keyinchalik, Google ushbu platformani qoʻllab-quvvatlash va uni yanada rivojlantirish bilan shugʻullanadigan Open Handset Alliance (OHA) shoʻbasini yaratdi.\n" +
                        "\n" +
                        "Android operatsion tizimi qurilmani Google tomonidan ishlab chiqilgan kutubxonalari orqali boshqariladigan Java ilovalarini ishga tushirish imkonini beradi. Android Native Development Kit sizga C va boshqa dasturlash tillarida yozilgan kutubxonalar va dastur komponentlari bilan ishlash imkonini beradi.\n" +
                        "\n" +
                        "2014-yilning ikkinchi choragida dunyo boʻylab sotilgan smartfonlarning 86 %ʼda Android tizimi oʻrnatilganligi hamda 2017-yil may oyida ishlab chiquvchilar konferentsiyasida Google butun Android tarixida 2 milliarddan ortiq Android qurilmalari faollashtirilganligini eʼlon qildi.\n" +
                        "\n" +
                        "Android operatsion tizimi qurilmani Google tomonidan ishlab chiqilgan kutubxonalari orqali boshqariladigan Java ilovalarini ishga tushirish imkonini beradi. Android Native Development Kit sizga C va boshqa dasturlash tillarida yozilgan kutubxonalar va dastur komponentlari bilan ishlash imkonini beradi."

                intent.putExtra("keyName", name)
                intent.putExtra("keyInfo", info)

                startActivity(intent)
            }else if (position == 1){

                val intent = Intent(this, InfoActivity::class.java)

                val name = "Java"
                val info = "Java yuqori darajali , sinfga asoslangan , ob'ektga yo'naltirilgan dasturlash tili bo'lib, u iloji boricha kamroq amalga oshirishga bog'liq bo'lishi uchun mo'ljallangan . Bu umumiy maqsadli dasturlash tili boʻlib, dasturchilarga bir marta yozish, istalgan joyda ishga tushirish imkonini beradi ( WORA ), kompilyatsiya qilingan Java kodi Java-ni qoʻllab-quvvatlaydigan barcha platformalarda qayta kompilyatsiya qilishni talab qilmasdan ishlashi mumkinligini anglatadi . [18] Java ilovalari odatda bayt -kodga kompilyatsiya qilinadi , ular asosiy narsadan qat'iy nazar har qanday Java virtual mashinasida (JVM) ishlaydi.kompyuter arxitekturasi . Java tilining sintaksisi C va C++ ga o'xshaydi , lekin ularning har ikkalasiga qaraganda kamroq past darajadagi imkoniyatlarga ega. Java ish vaqti odatda an'anaviy kompilyatsiya qilingan tillarda mavjud bo'lmagan dinamik imkoniyatlarni (masalan, aks ettirish va ish vaqti kodini o'zgartirish) taqdim etadi. 2019 yil holatiga koʻra , Java GitHub maʼlumotlariga koʻra , ayniqsa mijoz-server veb-ilovalari uchun ishlatiladigan eng mashhur dasturlash tillaridan biri boʻlib , 9 million ishlab chiquvchilari haqida xabar berilgan.\n" +
                        "\n" +
                        "Java dastlab Sun Microsystems kompaniyasida Jeyms Gosling tomonidan ishlab chiqilgan va 1995 yil may oyida Sun Microsystems Java platformasining asosiy komponenti sifatida chiqarilgan . Java kompilyatorlari , virtual mashinalari va sinf kutubxonalarining original va mos yozuvlar ilovasi dastlab Sun tomonidan xususiy litsenziyalar ostida chiqarilgan . 2007 yil may oyidan boshlab, Java Community Process spetsifikatsiyalariga muvofiq , Sun o'zining ko'pgina Java texnologiyalarini faqat GPL-2.0 litsenziyasi ostida qayta litsenziyaladi. Oracle o'zining HotSpot -ni taklif qiladiJava Virtual Machine, ammo rasmiy ma'lumotnoma ilovasi OpenJDK JVM bo'lib , u bepul ochiq kodli dasturiy ta'minot bo'lib, ko'pchilik ishlab chiquvchilar tomonidan qo'llaniladi va deyarli barcha Linux distributivlari uchun standart JVM hisoblanadi.\n" +
                        "\n" +
                        "2022-yil mart oyidan boshlab Java 18 eng soʻnggi versiya, Java 17, 11 va 8 esa joriy uzoq muddatli qoʻllab-quvvatlash (LTS) versiyalaridir. Oracle 2019-yil yanvar oyida Java 8 LTS-ning eski versiyasi uchun so‘nggi nol xarajatli ommaviy yangilanishni tijorat maqsadlarida foydalanish uchun chiqardi, garchi u Java 8-ni shaxsiy foydalanish uchun umumiy yangilanishlar bilan cheksiz muddatga qo‘llab-quvvatlaydi. Boshqa sotuvchilar hali ham xavfsizlik va boshqa yangilanishlarni olayotgan OpenJDK 18 va 8, 11 va 17 nol xarajatli tuzilmalarini taklif qila boshladilar.\n" +
                        "\n" +
                        "Oracle (va boshqalar) eski versiyalarda hal etilmagan xavfsizlik muammolari tufayli Java-ning eskirgan va qo'llab-quvvatlanmaydigan versiyalarini o'chirishni tavsiya qiladi. Oracle oʻz foydalanuvchilariga darhol LTS versiyalaridan biri (8, 11, 17) kabi qoʻllab-quvvatlanadigan versiyaga oʻtishni maslahat beradi."

                intent.putExtra("keyName", name)
                intent.putExtra("keyInfo", info)

                startActivity(intent)
            }else if (position == 2){

                val intent = Intent(this, InfoActivity::class.java)

                val name = "Kotlin"
                val info = "Kotlin ( / ˈ k ɒ t l ɪ n / ) — oʻzaro platformali , statik tarzda yozilgan , tip xulosasiga ega umumiy maqsadli dasturlash tili . Kotlin Java bilan toʻliq oʻzaro ishlash uchun moʻljallangan va Kotlin standart kutubxonasining JVM versiyasi Java sinf kutubxonasiga bogʻliq , [ tekshirish muvaffaqiyatsiz tugadi ] , lekin turdagi xulosalar uning sintaksisiga imkon beradi.qisqaroq bo'lishi uchun. Kotlin asosan JVM-ni maqsad qilib oladi, lekin JavaScript-ni (masalan, React dan foydalanadigan frontend veb-ilovalar uchun ) yoki LLVM orqali mahalliy kodni (masalan, Android ilovalari bilan biznes mantiqini almashuvchi mahalliy iOS ilovalari uchun ) kompilyatsiya qiladi. Tilni rivojlantirish xarajatlari JetBrains tomonidan qoplanadi , Kotlin fondi esa Kotlin savdo belgisini himoya qiladi. \n" +
                        "\n" +
                        "2019-yilning 7-mayida Google Kotlin dasturlash tili endi Android ilovalari ishlab chiquvchilari uchun afzal qilingan til ekanligini eʼlon qildi. 2017-yil oktabr oyida Android Studio 3.0 chiqarilganidan beri Kotlin standart Java kompilyatoriga muqobil sifatida kiritilgan. Android Kotlin kompilyatori sukut bo'yicha Java 8 bayt kodini ishlab chiqaradi (u har qanday keyingi JVMda ishlaydi), lekin dasturchi optimallashtirish uchun Java 9 dan 18 gacha maqsadni tanlash imkonini beradi yoki ko'proq funksiyalarga ruxsat beradi; Java 16 da taqdim etilgan, Kotlin 1.5 da barqaror deb hisoblangan JVM uchun ikki tomonlama rekord sinf oʻzaro ishlashni qoʻllab-quvvatlaydi.\n" +
                        "\n" +
                        "Kotlin internetni qo'llab-quvvatlaydi; JavaScript-ga kompilyatsiya qilish orqali (ya'ni, klassik back-endli Kotlin/JS 1.3-versiyasidan beri barqaror deb e'lon qilingan), yangi Kotlin/JS ( IR -asosli) esa 1.5.30 versiyasidan boshlab beta-versiyada. Kotlin/Native (masalan, Apple silikon qo'llab-quvvatlash uchun) 1.3 versiyasidan beri beta hisoblanadi."
                intent.putExtra("keyName", name)
                intent.putExtra("keyInfo", info)

                startActivity(intent)
            }else if (position == 3){

                val intent = Intent(this, InfoActivity::class.java)

                val name = "Python"
                val info = "Python yuqori darajali , talqin qilinadigan , umumiy maqsadli dasturlash tilidir . Uning dizayn falsafasi muhim girintilardan foydalangan holda kodning o'qilishiga urg'u beradi . \n" +
                        "\n" +
                        "Python dinamik tarzda yozilgan va axlat yig'ilgan . U bir nechta dasturlash paradigmalarini , jumladan, tuzilgan (ayniqsa , protsessual ), ob'ektga yo'naltirilgan va funktsional dasturlashni qo'llab-quvvatlaydi . Keng qamrovli standart kutubxonasi tufayli u ko'pincha \"batareyalar bilan jihozlangan\" til sifatida tavsiflanadi . \n" +
                        "\n" +
                        "Guido van Rossum 1980-yillarning oxirida ABC dasturlash tilining davomchisi sifatida Python ustida ishlay boshladi va birinchi marta 1991 yilda Python 0.9.0 sifatida chiqardi. Python 2.0 2000-yilda chiqarilgan va roʻyxatni tushunish , siklni aniqlovchi axlat yigʻish, havolalarni hisoblash va Unicode qoʻllab-quvvatlash kabi yangi xususiyatlarni taqdim etdi . 2008-yilda chiqarilgan Python 3.0, oldingi versiyalar bilan mutlaqo orqaga mos kelmaydigan katta versiya edi. Python 2 2020-yilda 2.7.18 versiyasi bilan to‘xtatildi. \n" +
                        "\n" +
                        "Python doimiy ravishda eng mashhur dasturlash tillaridan biri hisoblanadi"

                intent.putExtra("keyName", name)
                intent.putExtra("keyInfo", info)

                startActivity(intent)
            }else if (position == 4){

                val intent = Intent(this, InfoActivity::class.java)

                val name = "MySQL"
                val info = "MySQL ( / ˌ m aɪ ˌ ɛ s ˌ k juː ˈ ɛ l / ) — ochiq manbali relyatsion maʼlumotlar bazasini boshqarish tizimi (RDBMS). Uning nomi \"Mening\", hammuassisi Maykl Videniusning qizining ismi va \"SQL\", Strukturalangan soʻrovlar tilining qisqartmasi birikmasidan iborat . \n" +
                        " Relyatsion ma'lumotlar bazasima'lumotlarni bir yoki bir nechta ma'lumotlar jadvallarida tartibga soladi, ularda ma'lumotlar bir-biri bilan bog'liq bo'lishi mumkin; bu munosabatlar ma'lumotlarni tuzilishga yordam beradi. \n" +
                        " SQL - dasturchilar relyatsion ma'lumotlar bazasidan ma'lumotlarni yaratish, o'zgartirish va chiqarish, shuningdek, ma'lumotlar bazasiga foydalanuvchi kirishini boshqarish uchun foydalanadigan til. \n Relyatsion ma'lumotlar bazalari va SQL bilan bir qatorda, MySQL kabi RDBMS kompyuterning saqlash tizimida relyatsion ma'lumotlar bazasini amalga oshirish uchun operatsion tizim bilan ishlaydi, foydalanuvchilarni boshqaradi, tarmoqqa kirishga ruxsat beradi va ma'lumotlar bazasi yaxlitligini sinab ko'rish va zaxira nusxalarini yaratishni osonlashtiradi."

                intent.putExtra("keyName", name)
                intent.putExtra("keyInfo", info)

                startActivity(intent)
            }else if (position == 5){

                val intent = Intent(this, InfoActivity::class.java)

                val name = "Php"
                val info = "PHP (/pi:.eɪtʃ.pi:/; inglizcha: PHP: Hypertext Preprocessor — „hipermatnli protsessor“) — skript tili boʻlib, web serverda oʻzgaruvchan HTML fayllarini yaratishda qoʻllaniladi. \n 1994-yilda kanadalik dasturchi Rasmus Lerdorf tomonidan yaratilgan. \n Hozirgi kunda deyarli barcha hosting-provayderlar mazkur tilni qoʻllab-quvvatlaydi. Odatda, PHP maʼlumotlar bazasi bilan ishlatiladi. \n PHP GNU GPL litsenziyasi orqali tekin tarqatiladi."

                intent.putExtra("keyName", name)
                intent.putExtra("keyInfo", info)

                startActivity(intent)
            }


        }

    }

    private fun listQoshish() {

        list = ArrayList()

        list.add(User(R.drawable.android, "Android"))
        list.add(User(R.drawable.java, "Java"))
        list.add(User(R.drawable.kotlin, "Kotlin"))
        list.add(User(R.drawable.python, "Python"))
        list.add(User(R.drawable.mysql, "MySQL"))
        list.add(User(R.drawable.php, "Php"))


    }


}