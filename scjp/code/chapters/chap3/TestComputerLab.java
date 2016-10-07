     class TestComputerLab {
        public static void main(String[] args) {
            ComputerLab cslab = new ComputerLab();
            cslab.printSeatInfo();
            System.out.println("Total seats in the class room: " + cslab.getTotalSeats());
        }

     }

        class ComputerLab extends ClassRoom {
           int  totalComputers = 30;
           String labAssistant="TBA";
         
         void printSeatInfo() {
            System.out.println("There are " + getTotalSeats() + " seats, and "  +  totalComputers + "  computers in this computer lab.");
         }
         String getLabAssistant(){
             return labAssistant;
        }
        void setLabAssistant(String assistant){
             this.labAssistant = assistant;
        }

     }