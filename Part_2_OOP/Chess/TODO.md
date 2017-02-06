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

3. [ ] Добавить метод Cell[] way(Cell dist) throw ImposibleMoveException
    Метод должен работать так:  
      - dist - задают ячейку куда следует пойти.  
       *dist -> newCoordinate*
    	    1. Если фигура может туда пойти.  
    		    - то Вернуть массив ячеек. которые должна пройти фигура.
    	    2. Если фигура туда пойти не может.
    		    - выбросить исключение ImposibleMoveException
    		    
    Этот "Путь" нужен, чтобы узнать, есть ли на пути кто то или нет. 
     
     
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
  
    * [ ] Создать ошибки:  
        - ImpossibleMoveException ->  
            ImpossibleMovementException,   
        - OccupiedWayException, 
            (his place all ready occupied by the other 
            figure with the same color)   
        - FigureNotFoundException - ? 
           а зачем нужно эта ошибка? куда её вставлять?

8. [ ] Метод *( boolean move() )* должен должен проверить   - Что в заданной ячейки есть фигура. если нет. то выкинуть исключение
    - Если фигура есть.  
    	    &ensp;&ensp; 
    	    Проверить может ли она так двигаться.  
        Если нет  
    	    &ensp;&ensp; 
    	    то упадет исключение

    - Проверить что полученный путь не занят фигурами.  
    	1. Если занят  
    	    - выкинуть исключение  
    	        OccupiedWayException  
        2. Если все отлично.  
    	    - Записать в ячейку новое новое положение   
    	    ~~Figure figure.clone(Cell dist)~~
    	    *whiteBishop.setNowCoordinate(newCoordinate);*

9. [ ] Изначально сделайте только движения фигуры слон 
        и покажите промежуточный результат.