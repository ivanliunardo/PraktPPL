public class Room {
    private String roomId;
    private Text file;

    public Room(String roomId, Text file ) {
        this.roomId = roomId;
        this.file = file;
    }

    public String selectRoom() {
        return this.roomId;
    }

    public Text sendFile(){
        return this.file;
    }

}