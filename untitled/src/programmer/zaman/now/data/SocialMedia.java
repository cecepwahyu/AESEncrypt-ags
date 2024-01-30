package programmer.zaman.now.data;

class SocialMedia {
    String username;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {
        //isi method
    }
}

//tidak bisa mewarisi class final di atas
//class Twitter extends Facebook {
//    void login (String username, String password) {
//        //isi method
//    }
//}
