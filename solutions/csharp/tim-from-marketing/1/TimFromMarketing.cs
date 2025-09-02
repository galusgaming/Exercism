static class Badge
{
    public static string Print(int? id, string name, string? department)
    {
        string s = "";
        if (id != null)
        {
            s ="[" + id + "]" + " - ";
        }
        if (name is not null)
        {
            s += name+" - ";
        }
        if (department is not null)
        {
            s += department.ToUpper();
        }else if (department is null)
            s += "OWNER";
        return s;
    }
}
