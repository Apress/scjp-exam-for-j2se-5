 class ClassRoom {
         private String roomNumber;
         private int totalSeats = 60;
         private static int totalRooms = 0;
         
         void setRoomNumber(String rn) {
            roomNumber = rn;
         }
         String getRoomNumber() {
            return roomNumber;
         }
         void setTotalSeats(int seats) {
              totalSeats = seats;
         }
          int getTotalSeats() {
            return totalSeats;
          }
    }