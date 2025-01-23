class Fighter {
    
    boolean isVulnerable () {
        return true;
    }
    
    int getDamagePoints (Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    
    @Override
    boolean isVulnerable () {
        return false;
    }
    
    @Override
    int getDamagePoints (Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }
        else {
            return 6;
        }
    }
    
    @Override
    public String toString () {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    
    private boolean isSpellPrepared;
    
    @Override
    boolean isVulnerable () {
        return !isSpellPrepared;
    }
    
    @Override
    int getDamagePoints (Fighter fighter) {
        return isSpellPrepared ? 12 : 3;
    }
    
    void prepareSpell () {
        isSpellPrepared = true;
    }
    
    @Override
    public String toString () {
        return "Fighter is a Wizard";
    }
}
