package f_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLParser {

	public static void main(String[] args) {

		String data = "<data>\n" + "    <subTag attr1='value' attr2='another value' />\n"
				+ "    <subTag2 attr3='value' attr4='another value' />\n" + "</data>\n";

		// On veut au moins une premi�re lettre (ou chiffre) pour �viter un tag fermant
		// (</data>).
		// Et on essaye de ne pas prendre le caract�re / des tags auto-fermants.
		String tagExtractionRegExp = "<([a-zA-Z_].*?)\\s*/?>";
		Pattern tagPattern = Pattern.compile(tagExtractionRegExp, Pattern.DOTALL);

		// Le caract�re : est autoris� pour le nom d'un tag (notion de namespace XML).
		String tagNameExtractionRegExp = "([a-zA-Z0-9_:-]+)";
		Pattern tagNamePattern = Pattern.compile(tagNameExtractionRegExp, Pattern.DOTALL);

		// On simplifie le probl�me en disant qu'une valeur d'attribut est constitu�e de
		// lettres
		// et de chiffres. Notez la pr�sence des deux paires de parenth�ses pour sortir
		// le nom de l'attribut et sa valeur.
		String attributeExtractionRegExp = "([a-zA-Z0-9_:-]+)=['\"]([a-zA-Z0-9 ]*)['\"]";
		Pattern attributePattern = Pattern.compile(attributeExtractionRegExp, Pattern.DOTALL);

		Matcher htmlMatcher = tagPattern.matcher(data);
		while (htmlMatcher.find()) {
			// R�cup�ration du contenu du tag
			String tagContent = htmlMatcher.group(1);

			// Affichage du nom du tag
			Matcher tagNameMatcher = tagNamePattern.matcher(tagContent);
			if (tagNameMatcher.find()) {
				System.out.println(tagNameMatcher.group(1));
			}

			// Affichage des attributs du tag courant
			Matcher attributeMatcher = attributePattern.matcher(tagContent);
			while (attributeMatcher.find()) {
				System.out.printf("    %s: %s\n", attributeMatcher.group(1), attributeMatcher.group(2));
			}
		}

	}

}
