package errorhandling;

class BaseException extends Exception{}

class BaseClass{
    BaseClass() throws BaseException{
        throw new BaseException();
    }
}

public class Exercise21 extends BaseClass{
    //! No way to catch exception thrown from class Base constructor;
    Exercise21() throws BaseException{
        super();
        //! Can't catch without try
        //			catch(BaseException e){}
        //! Calling super must be the first statement in constructor
        //			try{
        //				super();
        //			} catch(BaseException e){}
    }

    public static void main(String[] args) throws BaseException {
        try{
            new Exercise21();
        } catch (BaseException e){
            System.out.println("Base Exception caught");
        }
    }
}
