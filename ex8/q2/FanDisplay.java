class Fan implements Observer {
    private String name;

    public Fan(String name) {
        this.name = name;
    }

    @Override
    public void update(String score) {
        System.out.println(name + " received live result: " + "Thai " + score + " UAE ");
    }
}