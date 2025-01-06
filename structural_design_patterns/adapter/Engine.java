package structural_design_patterns.adapter;


sealed interface Engine permits ElectricEngine, PetrolEngine {
    void run();
    void tank();
}