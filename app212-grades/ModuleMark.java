
/**
 * Module Mark is the class in which each individual mark is assigned to a
 * student, The module Mark class also dictates whether or not the student
 * recives the class credit.
 *
 * @author Derek Peacock and Nicholas Day
 * @edited by Cory Martin
 * @version 1.0 04/11/2021
 */
public class ModuleMark
{
    private int mark;
    private Module module;
    
    /**
     * Constructor for objects of class ModuleMark
     */
    public ModuleMark(Module module)
    {
        mark = 0;
        this.module = module;
    }
    
    public int getValue()
    {
        return mark;
    }
    
    /**
     * If the mark is 40% or more then the 
     * student is awarded the module's credit.
     */
    public int getCredit()
    {
        if(mark <= Grades.F.getValue())
        {
            return 0;
        }
        else
        {
            return Module.CREDIT;
        }
    }
    
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    
    public Module getModule()
    {
        return module;
    }
    
    /**
     * Print the module details and any credit
     * that has been awarded.
     */
    public void print()
    {
        module.print();
        System.out.print("\t  " + getCredit() + "\t" + mark);
    }
}
