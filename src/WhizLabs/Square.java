package WhizLabs;

public class Square {

        int length;
        WhizLabs.Square sq;

        Square(int length) {
            this.length = length;
        }

        void setInner(WhizLabs.Square sq) {
            this.sq = sq;
        }

        int getLength() {
            return this.length;
        }
    }


