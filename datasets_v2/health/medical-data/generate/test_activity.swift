import SwiftUI
struct test_activity: View {
@State private  var question7_rating  : String? 
@State private  var question11_rating  : String? 
var body: some View {
ScrollView
{
ZStack
{
ZStack
{
VStack
{
Text("Affective state")
.padding(.top,20)
HStack
{
Spacer()
Image("ic_menu_help")
.padding(.leading,10)
.padding(.leading,10)
.accessibility(label: Text("@+id/help"))
}
}
Rectangle()
.fill(Color(red:0.7529412,green:0.7529412,blue:0.7529412,opacity:1.0))
.frame(minHeight:2,idealHeight:2)
Rectangle()
.padding(.top,10)
Text("Motivation")
.padding(.top,20)
Text("Concentration")
.padding(.top,20)
Text("Anxiety")
.padding(.top,20)
Text("Irritability")
.padding(.top,20)
Text("Sleep quality")
.padding(.top,20)
ZStack
{
VStack
{
Text("Menstruation")
.padding(.top,20)
HStack
{
Spacer()
Image("ic_menu_help")
.padding(.leading,10)
.padding(.leading,10)
.accessibility(label: Text("@+id/help"))
}
}
Rectangle()
.fill(Color(red:0.7529412,green:0.7529412,blue:0.7529412,opacity:1.0))
.frame(minHeight:2,idealHeight:2)
HStack
{
Button(action: { 6507a09a-45b4-45a7-9184-d74a9feb29c2 = "No" })
{
HStack
{
Image(systemName: 650 == "No" ? "checkmark.circle.fill" : "circle")
Text("No")
.foregroundColor(.black)
}
}
Button(action: { 6507a09a-45b4-45a7-9184-d74a9feb29c2 = "Yes" })
{
HStack
{
Image(systemName: 650 == "Yes" ? "checkmark.circle.fill" : "circle")
.padding(.leading,70)
.padding(.leading,70)
Text("Yes")
.foregroundColor(.black)
.padding(.leading,70)
.padding(.leading,70)
}
.padding(.leading,70)
.padding(.leading,70)
}
.padding(.leading,70)
.padding(.leading,70)
}
}
Text("Caffeine")
.padding(.top,30)
Rectangle()
.padding(.top,5)
Text("Alcohol")
.padding(.top,30)
Text("Cigarettes")
.padding(.top,25)
Text("Other drugs")
.padding(.top,25)
HStack
{
Button(action: { question11_rating = "No" })
{
HStack
{
Image(systemName: question11_rating == "No" ? "checkmark.circle.fill" : "circle")
Text("No")
.foregroundColor(.black)
}
}
Button(action: { question11_rating = "Yes" })
{
HStack
{
Image(systemName: question11_rating == "Yes" ? "checkmark.circle.fill" : "circle")
.padding(.leading,70)
.padding(.leading,70)
Text("Yes")
.foregroundColor(.black)
.padding(.leading,70)
.padding(.leading,70)
}
.padding(.leading,70)
.padding(.leading,70)
}
.padding(.leading,70)
.padding(.leading,70)
}
Text("Time to go to bed")
.padding(.top,30)
Rectangle()
.padding(.top,10)
.padding(.leading,20)
.padding(.trailing,20)
Text("Time to sleep")
.padding(.top,30)
Text("Time to wake up")
.padding(.top,30)
Rectangle()
.fill(Color(red:0.7529412,green:0.7529412,blue:0.7529412,opacity:1.0))
.frame(minHeight:2,idealHeight:2)
.padding(.top,50)
Button(action: {})
{
Text("SEND")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(.top,30)
Text("")
.padding(.top,20)
.padding(.bottom,20)
.foregroundColor(Color(red:0.9137255,green:0.11764706,blue:0.3882353,opacity:1.0))
}
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)
}
}}}

struct test_activity_Previews: PreviewProvider {
    static var previews: some View {
        test_activity()
    }
}
