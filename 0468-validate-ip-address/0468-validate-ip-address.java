class Solution {
    public boolean isValidIPV4(String ip)
    {
        try{
            int periodcount=0;
            if(ip.charAt(0)=='.' || ip.charAt(ip.length()-1)=='.') return false;

            for(int i=0;i<ip.length();i++)
            {
                if(ip.charAt(i)=='.') periodcount++;
            }

            if(periodcount!=3) return false;
            String arr[] = ip.split("\\.");
            
            if(arr.length!=4) return false;

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].equals("")) return false;
                if(!(arr[i].equals("0")))
                {
                    if(arr[i].charAt(0)=='0' || arr[i].contains("@") ||arr[i].contains("!") || arr[i].contains("#") ||arr[i].contains("%") || arr[i].contains("&") || arr[i].contains("*"))
                    {
                        return false;
                    }
                }
                int num = numericValue(arr[i]);
                if(num>255 || num<0)
                {
                    return false;
                }
            }

        }catch(Exception e){}
    return true;
    }

    public boolean isValidIVP6(String ip)
    {
        try
        {
            if(ip.charAt(0)==':' || ip.charAt(ip.length()-1)==':') return false;

            int colon=0;
            for(int i=0;i<ip.length();i++)
            {
                if(ip.charAt(i)==':') colon++;
            }
            if(colon!=7) return false;

            String arr[] = ip.split(":");
            if(arr.length!=8) return false;

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].length()<1 || arr[i].length()>4) return false;

                for(char c : arr[i].toCharArray())
                {
                    if(!Character.isDigit(c) && (!("1234567890abcdefABCDEF").contains(String.valueOf(c))))
                    {
                        return false;
                    }
                }
            }        
        }
        catch(Exception e){}
    return true;
    }

    public int numericValue(String s)
    {
        int n;
        try
        {
            n = Integer.parseInt(s);
        }
        catch(Exception e){
            return -1;
        }
    return n;
    }

    public String validIPAddress(String queryIP) {
        if(queryIP.equals("")) return "Neither";
        if(isValidIPV4(queryIP))
        {
            return "IPv4";
        }

        if(isValidIVP6(queryIP))
        {
            return "IPv6";
        }

    return "Neither";
    }
}