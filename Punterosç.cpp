char aux[20];
	int longitud;

	fot(int i = 0; i < 3; i++) {
		printf("\npalabra %d", cont);
	for(int i = 0; i < 3; i++) {
		printf("\npalabra %d: ", i);
		scanf("%s", aux);
		longitud = strlen(aux);
		lista[i] = (char *) malloc(longitud);
@@ -19,4 +19,7 @@ int main() {
	printf("\n**********");
	printf("\n  LISTA  ");
	printf("\n**********");
	for(int i = 0; i < 3; i++) {
		printf("\n %d .- %s", i, *(lista+i));
	}
}
