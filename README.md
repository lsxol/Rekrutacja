ZAD 1
1.A. 
    
    W przypadku klas abstrakcyjnych gdzie kilka klas dziedziczy po niej, łatwiej jest dodać kolejną metodę, ponieważ wszystkie
    klasy dziedziczące już będą ją posiadały. Zatem wystarczy określić działanie metody tylko w jednym miejscu zamiast w wielu.

    Interfejsy są używane, gdy trzeba dodać zachowania danych klas, ale bez dodawania działania danej metody. W tym przypadku
    każda klasa może mieć różne zastosowanie danej metody.

1.B. 
    
    Tablice są z góry określone jeżeli chodzi o ich rozmiar. Są umieszczone w pamięci jako całe bloki, co sprawia, że znacznie
    gorzej dodaje się i usuwa z niej dane. Bardzo sprawnie za to działa odczyt danych. Notacja O szybkości operacji
    dodawania oraz usuwania wynosi O(n) za to odczyt to O(1).


    W przypadku list sytuacja jest odwrotna. Obiekty nie są umieszczane "obok siebie" w pamięci, ale oprócz wartości, każdy
    z zapisanych obiektów posiada adres kolejnego obiektu w liście. Sprawia to, że dodawanie czy usuwanie danych z listy jest
    szybsze niż w przypadku tablicy, ale odczyt danych jest znacznie bardziej wydłużony. Notacja O szybkości operacji
    dodawania oraz odejmowania to O(1), odczyt danych to O(n)

ZAD 2 
W tym przypadku wybrałem metodę wyszukiwania binarnego.
Złożoność obliczeniowa tego sposobu to O(logn), a pamięciowa O(1).

