package observer;

public interface Subject {
    /*
        옵저버 등록, 삭제
     */
    void registerObserver(Observer observerPush);
    void removeObserver(Observer observerPush);
    /*
        주제의 상태가 변경되었을 때 모든 옵저버에게 변경 내용을 알리려고 호출되는 메소드
     */
    void notifyObservers();
}
