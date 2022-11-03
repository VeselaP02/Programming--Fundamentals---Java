package Object_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        private String typeList;
        private  String name;
        private String time;

        public Song(String typeList,String name,String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSong = Integer.parseInt(scanner.nextLine());

        List<Song> listSong = new ArrayList<>();
        for (int i = 1; i <= countSong ; i++) {
            String input = scanner.nextLine();
            String [] dataArr = input.split("_");

            Song currentSong = new Song(dataArr[0], dataArr[1], dataArr[2] );
            listSong.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song songs:listSong) {
                System.out.println(songs.getName());
            }
        } else {
            for (Song item:listSong) {
                if (item.getTypeList().equals(command)){
                    System.out.println(item.getName());
                }
            }
        }
    }
}
