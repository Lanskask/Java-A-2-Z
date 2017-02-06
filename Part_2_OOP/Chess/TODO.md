### Todo for Chess project

1. реализовать шахматную доску.

2. должна бытьChess  возможность двигать фигуру.

3. система должна проверять корректность движения фигуры.

4. каждая фигура должна двигаться в соответствии со своей логикой.

5. нельзя ставить на занятые поля.

6. нельзя перемещать фигуру, если на пути стоит другая фигура. кроме коня.

7. в этом задании не надо делать меню и пользователей. меня интересует только логика. а не ввод данных.

8. все выше описанные поведения должны быть проверен через Junit tests.


#### Общая схема реализации

1. [x] Прочитать про шаблон проектирования стратегия.

2. [x] Создать aбстрактный класс Figure

2. [x] В Figure сделать поля final Cell position - и конструктор.  
    Cell -> Coordinate  
    **TODO: Should it be final?**  
    ~~В классе не должно быть методов set get~~

3. [x] Добавить метод Cell[] way(Cell dist) throw ImposibleMoveException
    Метод должен работать так:  
      - dist - задают ячейку куда следует пойти.  
       *dist -> newCoordinate*  
       ```
            ArrayList<Coordinate> track(Coordinate newCoordinate) 
            throw ImposibleMoveException {
            }
       ```
    	    1. Если фигура может туда пойти.  
    		    - то Вернуть массив ячеек. которые должна пройти фигура.
    	    2. Если фигура туда пойти не может.
    		    - выбросить исключение ImposibleMoveException
    		    
    Этот "Путь" нужен, чтобы узнать, есть ли на пути кто то или нет. 
    **Вопрос:** Что значит фигура может туда пойти? 
    В смысле в данном случае идёт ли она по правилам?
    Или что по пути не стоит дргая фигура?
    Но как тогда этот метод находящийся внутри класса 
    какой-то фигуры узнает о других конкретных фигурах, 
    которые находятся в масиве в к классе parts.ChessDesk ?
    
    Вместо этого я сделал метод  
    	```ArrayList<Coordinate> track(Coordinate newCoordinate)```   
    каждый разный у фигур (у Ладьи и Слона)  
    и метод  
    	```boolean thereNoFiguresOnTheWay(Figure figure, Coordinate newCoordinate)```  
    в классе ChessDesk
     
4. [x] Cell - описывает ячейки шахматной доски  
        Cell -> Coordinate

5. [x] Создать класс Board.

6. [x] В классе создать массив Figure[] figures

7. [ ] Добавить метод   
        boolean move(Cell source, Cell dist)  
        **move -> movement(nowCoord, newCoord)**  
        throws  
        ImpossibleMoveException,  
        OccupiedWayException,  
        FigureNotFoundException 
    
    В моей реализации я не знаю куда вставить FigureNotFoundException   
  
    * [x] Создать ошибки:  
        - ImpossibleMoveException ->  
            ImpossibleMovementException,   
        - OccupiedWayException, 
            (his place all ready occupied by the other 
            figure with the same color)   
        - FigureNotFoundException - ? 
           а зачем нужно эта ошибка? куда её вставлять?

8. [ ] Метод *( boolean move() )* должен должен 
        проверить   
      - Что в заданной ячейки есть фигура. 
      - если нет. 
          * то выкинуть исключение
          <hr>
      - Если фигура есть.  
         * Проверить может ли она так двигаться.  
      - Если нет
         * то упадет исключение   
         <hr>
         
     - Проверить что полученный путь не занят фигурами.  
    	1. Если занят  
    	    - выкинуть исключение  
    	        OccupiedWayException  
        2. Если все отлично.  
    	    - Записать в ячейку новое новое положение   
    	    ~~Figure figure.clone(Cell dist)~~
    	    *whiteBishop.setNowCoordinate(newCoordinate);*

    Вместо этого в классе ChessDesk сделал метод  
        ```void moveSomeConcreteFigure(
        Figure figure, Coordinate newCoordinate)
        throws OccupiedWayException```     
    Try Catch для ImpossibleMovementException
    я не уверен но получается придётся добавлять 
    в каждом классе в методе movement. 
    Добавил ImpossibleMovementException для 
    Слона, Ладьи и Ферзя (Королевы).
    
9. [ ] Изначально сделайте только движения фигуры слон 
        и покажите промежуточный результат.
        
### Done:
1. ArrayList<Coordinate> track(Coordinate newCoordinate) для Ладьи
1. ArrayList<Coordinate> track(Coordinate newCoordinate) для Слона