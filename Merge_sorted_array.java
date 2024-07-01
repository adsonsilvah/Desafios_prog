public class Merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // índice para o final do array nums1 original
        int j = n - 1; // índice para o final do array nums2
        int k = m + n - 1; // índice para o final do array nums1 com espaço extra

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copia os elementos restantes de nums2 para nums1, se houver
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        }
    public static void main(String[] args) {
        Merge_sorted_array sol = new Merge_sorted_array();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        // Imprimir o resultado
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
    }
