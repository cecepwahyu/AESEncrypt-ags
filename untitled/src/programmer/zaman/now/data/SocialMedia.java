package programmer.zaman.now.data;

class SocialMedia {
    String username;
}

final class Facebook extends SocialMedia {

}

//tidak bisa mewarisi class final di atas
class Twitter extends Facebook {

}
