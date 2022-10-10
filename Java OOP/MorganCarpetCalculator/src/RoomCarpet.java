
public class RoomCarpet {
	private double CarpetCost;
	
	RoomDimension roomdimension;
	
	public RoomCarpet(double CarpetCost, RoomDimension roomdimension) {
		super();
		this.CarpetCost = CarpetCost;
		this.roomdimension = roomdimension;
		
	}
	
	public double getCarpetCost() {
		return CarpetCost;
	}
	
	public double totalCarpetCost() {
		return getCarpetCost() * roomdimension.RoomArea();
	}
	
	
}
