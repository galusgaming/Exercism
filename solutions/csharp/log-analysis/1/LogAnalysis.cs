public static class LogAnalysis 
{
    // TODO: define the 'SubstringAfter()' extension method on the `string` typs
    public static String SubstringAfter(this string s, string delimiter)
    {
        return s.Split(delimiter)[1];
    }
    

    // TODO: define the 'SubstringBetween()' extension method on the `string` type
    public static String SubstringBetween(this string s, string firstdelimiter, string seconddelimiter)
    {
        return s.Split(firstdelimiter)[1].Split(seconddelimiter)[0];
    }
    
    // TODO: define the 'Message()' extension method on the `string` type
    public static String Message(this string s)
    {
        return s.SubstringAfter(": ");
    }
    // TODO: define the 'LogLevel()' extension method on the `string` type
    public static string LogLevel(this string s)
    {
        return s.SubstringBetween("[", "]");
    }
}