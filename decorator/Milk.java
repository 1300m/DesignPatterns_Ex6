package decorator;

public class Milk extends Decorator {
    public Milk(Beverage component) {
        super(component);
    }

    @Override
	public int getCost() {
		return super.getCost() + 3;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "milk";
	}
}
