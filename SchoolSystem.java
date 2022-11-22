public class SchoolSystem implements ISignUp{

    Integer big;
    Integer medium;
    Integer small;

    public SchoolSystem(Integer big, Integer medium, Integer small){
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean addStudent(int stuType) {
        switch (stuType){
            case 1:
                if (big > 0) {
                    big--;
                    return true;
                }
                break;
            case 2:
                if (medium > 0) {
                    medium--;
                    return true;
                }
                break;
            case 3:
                if (small > 0) {
                    small--;
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }
}
