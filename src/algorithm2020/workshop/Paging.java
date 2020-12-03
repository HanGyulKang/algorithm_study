package algorithm2020.workshop;

import java.util.Scanner;

public class Paging {
    public static void paging2() throws Exception {
        Scanner scan = new Scanner(System.in);

        // 총 게시글 개수
        int cnt = 142;
        if(cnt <= 0) {
            throw new Exception("게시글이 없습니다");
        }

        // 페이지당 출력할 게시글 개수
        int div = 10;

        // 총 페이지 수
        int totalPages = cnt % div == 0 ? cnt / div : (cnt /div) + 1;

        System.out.println("[[ 페이징 처리 ]]");
        for (int i = 1; i <= totalPages; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n페이지를 선택해주세요 : ");
        int selectNum = scan.nextInt();

        int start = (selectNum * div) - (div - 1);
        int end = selectNum * div;

        System.out.println("\n선택한 페이지의 게시글 시작 번호는 [" + start + "], 끝 번호는 [" + (end > cnt ? end = cnt : end) + "]");
    }

    public static void main(String[] args) throws Exception {
        // 총 게시글 개수
        int cnt = 142;
        if(cnt <= 0) {
            throw new Exception("게시글이 없습니다");
        }

        // 페이지당 출력할 게시글 개수
        int div = 10;

        // 총 페이지 수
        int totalPages = cnt % div == 0 ? cnt / div : (cnt /div) + 1;

        for (int i = 1; i <= totalPages; i++) {
            int start = (i * div) - (div - 1);
            int end = i * div;

            if(end > cnt) {
                end = cnt;
            }
            System.out.println(i + "페이지, 시작호 번호 : " + start + " | 끝 번호 : " + end);
        }

        paging2();
    }
}
