public class RegexReplace {
    public static String removeUnits(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("(\\d+)(cm|€)(?=\\s|$)", "$1");
    }
    
    public static String obfuscateEmail(String s) {
        // your code here
        String [] email = s.split("@");
        String name = email[0];
        String domain = email[1];

        return obfuscateUsername(name) + "@" + obfuscateDomain(domain);
    }

    private static String obfuscateUsername (String username){
        // Obfuscate username
        String obfuscatedUsername;
        if (username.contains(".") || username.contains("-") || username.contains("_")) {
            int lastSpecialChar = Math.max(Math.max(username.lastIndexOf('.'), username.lastIndexOf('-')), username.lastIndexOf('_'));
            obfuscatedUsername = username.substring(0, lastSpecialChar + 1) + "*".repeat(username.length() - lastSpecialChar - 1);
        } else if (username.length() > 3) {
            obfuscatedUsername = username.substring(0, 3) + "*".repeat(username.length() - 3);
        } else {
            obfuscatedUsername = username.charAt(0) + "*".repeat(username.length() - 1);
        }
        return obfuscatedUsername;
    }

    private static String obfuscateDomain(String domain) {
        String obfuscatedDomain;
        String [] domainParts = domain.split("\\.");
        String topLevelDomain = domainParts[domainParts.length - 1];
        String secondLevelDomain = domainParts.length > 1 ? domainParts[domainParts.length - 2] : null;
        String thirdLevelDomain = domainParts.length > 2 ? domainParts[domainParts.length - 3] : null;
            if (thirdLevelDomain != null) {
                obfuscatedDomain = "*******." + secondLevelDomain + "." + "*".repeat(topLevelDomain.length());
            } else if (topLevelDomain.equals("com") || topLevelDomain.equals("org") || topLevelDomain.equals("net")) {
                obfuscatedDomain = "*******." + topLevelDomain;
            } else {
                obfuscatedDomain = "*******." + "*".repeat(topLevelDomain.length());
            }

            return obfuscatedDomain;
    }
}