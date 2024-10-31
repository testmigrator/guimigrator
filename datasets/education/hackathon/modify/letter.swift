import SwiftUI
struct letter: View {
    
    var body: some View {
        Button(action: {})
        {
            Text("null")
                .foregroundColor(.black)
        }
        .frame(minHeight:35,idealHeight:35)
        .background(Color.blue)}}

struct letter_Previews: PreviewProvider {
    static var previews: some View {
        letter()
    }
}
