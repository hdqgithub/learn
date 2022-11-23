public class SchoolSystem implements ISignUp{
// 第四周-git大作业修改测试
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

    //第一次添加注释
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
