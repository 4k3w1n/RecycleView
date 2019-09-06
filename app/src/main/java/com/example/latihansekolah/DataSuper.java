package com.example.latihansekolah;

import java.util.ArrayList;

public class DataSuper {
    private static String[] namaSuper = {
            "Dadang Bedog",
            "Tatang Kupluk",
            "Suryana",
            "Asep Rexona",
            "Dadang Hideung",
            "Mohammad Hatta",
            "Sudirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka",

    };

    private static String[] ditelSuper = {
            "Salah seorang Preman  terkemuka di Kampoeng Reman#012 Yogyakarta pada masa itu, dan ibu dari Dadang Bedog  adalah Sukenur Penitik",
            "Tatang Kupluk lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Sumur, Jakarta, 1 Oktober 1965 pada umur 43 tahun adalah komandan Hansip Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.",
            "Suryana (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Liang Kubur, Cikotok, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Kang Yana, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui Hansip NICA, yang berakhir dengan pertempuran 10 November 6666 yang hingga kini diperingati sebagai Hari Haharian.",
            "Jenderal TNI (Purn.) Asep Rexona (lahir di Sumpiuh, Banyumas, Jawa Tengah, 10 Oktober 1907 – meninggal di Jakarta, 11 Juni 1962 pada umur 54 tahun) adalah tokoh perjuangan Security Indonesia dalam merebut kemerdekaan dan juga pahlawan Kampung Indonesia. Ia dimakamkan di Ungaran, kabupaten Semarang.",
            "Dadang Hideung (EBI:Kang Black, sejak 1922 menjadi Nigganya Kampung Koerma. Kang Hideung, beberapa menuliskan bunyi bahasa Jawanya dengan Ki Hajar Siah Ku aing; lahir di Padalarang, 2 Mei 1889 – meninggal di Rumahnya, 26 April 1959 pada umur 69 tahun.",
            "Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, 12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun) adalah tokoh pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang pertama. Ia bersama Soekarno memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia juga pernah menjabat sebagai Perdana Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Ia mundur dari jabatan wakil presiden pada tahun 1956, karena berselisih dengan Presiden Soekarno. Hatta juga dikenal sebagai Bapak Koperasi Indonesia.",
            "Jenderal Besar Raden Soedirman (EYD: Sudirman; lahir 24 Januari 1916 – meninggal 29 Januari 1950 pada umur 34 tahun) adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia. Menjadi panglima besar Tentara Nasional Indonesia pertama, ia secara luas terus dihormati di Indonesia. Terlahir dari pasangan rakyat biasa di Purbalingga, Hindia Belanda, Soedirman diadopsi oleh pamannya yang seorang priyayi. Setelah keluarganya pindah ke Cilacap pada tahun 1916, Soedirman tumbuh menjadi seorang siswa rajin; ia sangat aktif dalam kegiatan ekstrakurikuler, termasuk mengikuti program kepanduan yang dijalankan oleh organisasi Islam Muhammadiyah. Saat di sekolah menengah, Soedirman mulai menunjukkan kemampuannya dalam memimpin dan berorganisasi, dan dihormati oleh masyarakat karena ketaatannya pada Islam. Setelah berhenti kuliah keguruan, pada 1936 ia mulai bekerja sebagai seorang guru, dan kemudian menjadi kepala sekolah, di sekolah dasar Muhammadiyah; ia juga aktif dalam kegiatan Muhammadiyah lainnya dan menjadi pemimpin Kelompok Pemuda Muhammadiyah pada tahun 1937. Setelah Jepang menduduki Hindia Belanda pada 1942, Soedirman tetap mengajar. Pada tahun 1944, ia bergabung dengan tentara Pembela Tanah Air (PETA) yang disponsori Jepang, menjabat sebagai komandan batalion di Banyumas. Selama menjabat, Soedirman bersama rekannya sesama prajurit melakukan pemberontakan, namun kemudian diasingkan ke Bogor.",
            "Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun) adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
            "Prof. Mr. Dr. Soepomo (Ejaan Soewandi: Supomo; lahir di Sukoharjo, Jawa Tengah, 22 Januari 1903 – meninggal di Jakarta, 12 September 1958 pada umur 55 tahun) adalah seorang pahlawan nasional Indonesia. Soepomo dikenal sebagai arsitek Undang-undang Dasar 1945, bersama dengan Muhammad Yamin dan Soekarno.",
            "Tan Malaka atau Ibrahim gelar Datuk Sutan Malaka (lahir di Nagari Pandam Gadang, Suliki, Lima Puluh Kota, Sumatera Barat, 2 Juni 1897 – meninggal di Desa Selopanggung, Kediri, Jawa Timur, 21 Februari 1949 pada umur 51 tahun) adalah seorang pembela kemerdekaan Indonesia, tokoh Partai Komunis Indonesia, juga pendiri Partai Murba, dan merupakan salah satu Pahlawan Nasional Indonesia."
    };

    private static int[] fotoSuper = {
            R.drawable.dadangbedog,
            R.drawable.tatangkupluk,
            R.drawable.suryana,
            R.drawable.aseprexona,
            R.drawable.dadang_hideung,
            R.drawable.mohammad_hatta,
            R.drawable.sudirman,
            R.drawable.sukarno,
            R.drawable.supomo,
            R.drawable.tan_malaka
    };

    static ArrayList<Super> getListData(){
        ArrayList<Super> list = new ArrayList<>();
        for (int position = 0; position <namaSuper.length; position++) {
            Super hero = new Super();
            hero.setName(namaSuper[position]);
            hero.setDetail(ditelSuper[position]);
            hero.setFoto(fotoSuper[position]);
            list.add(hero);
        }
        return list;
    }
}


