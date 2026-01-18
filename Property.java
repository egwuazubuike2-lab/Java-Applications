public class Property{
	public static void main(String[] args){
	
		int id;
		String address;
		double rent;

		public Property(int id, String address, double rent) {
			this.id = id;
			this.address = address;
			this.rent = rent;
		}

		public void display() {
			System.out.println("ID: " + id +
            ", Address: " + address +
            ", Rent: " + rent);
		}
	}
}