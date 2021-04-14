
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {

        int diff = (this.pricePerSquare * this.squares)
                - (compared.pricePerSquare * compared.squares);

        return diff > 0 ? diff : diff * -1;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return (this.pricePerSquare * this.squares) > 
                (compared.pricePerSquare * compared.squares);
    }

}
