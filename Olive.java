class Olive extends ToppingDecorator{
    public Olive(Pizza pizza){
        super(pizza);
    }
    @Override 
    public double getCost(){
        return super.getCost()+1.0;
    }
    @Override 
    public String getDescription(){
        return super.getDescription() + ", Olives";
    }
}