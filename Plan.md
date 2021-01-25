# Short Description
დიზაინი იქნება აწყობილი Adobe XD-ის გამოყენებით. 
ეს აპლიკაცია ემსახურება შეკვეთების მიღებას და შემდგომ ერთ სივრცეში გამოტანას. პრაქტიკული გამოყენება აქვს მხოლოდ 
მცირე კერძო ბიზნესებითვის, რადგან გათვლილია რამდენიმე ადამიანისგან შექმნილ ჯგუფზე, მაგალითად, არსებობს ბევრი პატარა კომპანია, რომლებიც 
მუშაობენ სოციალური მედიებისა და ონლაინ მაღაზიების ვებ-საიტებზე. შეკვეთების მიღება უმეტესწილად ხდება არაოფიციალური მიმოწერით და 
შემოსული ინფორმაციის ჩანიშვნა ან საერთოდ არ ხდება(იგულისხმება Database-ში) ან ხდება არაეფექტურად ფურცელზე. შეკვეთების მიღებისა და კოორდინაციისთვის
არის შექმნილი ეს აპლიკაცია.დაფუძნებულია FireBase-ზე(ავტორიზაცია/რეგისტრაცია/ინფორმაციის შენახვა).

ინფორმაციის შესანახად გამოიყენება FireBase FireStore

# Authentication
პირველი გვერდი იქნება ავტორიზაციის ან რეგისტრაციის გვერდზე გადასვლისთვის.

# Login
ავტორიზაციის გვერდის დიზაინი ისევე როგორც , ყველა სხვა გვერდის შექმნილია წინასწარ.

# Sign up
...

# Main Page
აწყობილი დიზაინის მიხედვით იქნება მხოლოდ ორი ღილაკი შეკვეთის დამატების და შეკვეთების სრული სიის ნახვის გვერდებზე გადასასვლელად, ასევე იქნება გვერდით ჩაშენებული
გამოსაწევი მენიუ, რომელშიც იქნება პროფილის სურათი და სტატისტიკა შეკვეთებთან დაკავშირებით და თავისთავად Sign out-ის ღილაკი

# Add Page
იქნება შესაყვანი ველები:
  >Customer Name
  >Product
  >Date
  >Price
  >Address
  
# Orders Page
იქნება შეკვეთების სრული სია გამოტანილი recycleview-ს მეშვეობით , ხოლო გვერდით მარტივი Checkbox რათა განვსაზღვროთ რომელი შეკვეთებია რელევანტური დროის კონკრეტულ მომენტში.