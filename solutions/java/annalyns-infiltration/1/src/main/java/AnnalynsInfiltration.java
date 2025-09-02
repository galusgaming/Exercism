class AnnalynsInfiltration {
    
    public static boolean canFastAttack(boolean knightIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        return (knightIsAwake)? false : true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        return (knightIsAwake || archerIsAwake || prisonerIsAwake)? true : false;
        }
        
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

        return (prisonerIsAwake && !archerIsAwake)? true : false;
        
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && prisonerIsAwake && !archerIsAwake || !archerIsAwake && petDogIsPresent)? true : false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
